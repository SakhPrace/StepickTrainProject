package Prog43;

public class UntrustworthyMailWorker implements MailService {

    private MailService[] mailServices;

    private RealMailService realMailService = new RealMailService();

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
    }

    public RealMailService getRealMailService(){
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService mailService: mailServices){
            mail = mailService.processMail(mail);
        }
        return realMailService.processMail(mail);
    }
}
