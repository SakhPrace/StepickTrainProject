package LoggingProgTrain;

public class Thief implements MailService {

    private int minValue;
    private int stolenValue = 0;

    public Thief(int value) {
        minValue = value;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage){
            int mailValue = ((MailPackage) mail).getContent().getPrice();
            if (mailValue >= minValue){
                stolenValue += mailValue;
                String mailContent = ((MailPackage) mail).getContent().getContent();
                mailContent = "stones instead of " + ((MailPackage) mail).getContent().getContent();
                mailValue = 0;
                Package newPackage = new Package(mailContent, mailValue);
                MailPackage newMailPackage = new MailPackage(mail.getFrom(), mail.getTo(), newPackage);
                return newMailPackage;
            }else{
                return mail;
            }
        }else{
            return mail;
        }
    }
}
