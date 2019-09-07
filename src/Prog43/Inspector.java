package Prog43;

public class Inspector implements MailService {

    private static final String WEAPONS = "weapons";
    private static final String BANNED_SUBSTANCE = "banned substance";

    public Inspector(){super();}

    @Override
    public Sendable processMail(Sendable mail){
        if (mail instanceof MailPackage){
            Package pack = ((MailPackage) mail).getContent();
            if (pack.getContent().contains(WEAPONS) || pack.getContent().contains(BANNED_SUBSTANCE)){
                throw new IllegalPackageException();
            }else if (pack.getContent().contains("stones")){
                throw new StolenPackageException();
            }else{
                return mail;
            }
        }else {
            return mail;
        }
    }

}
