package Prog43;

import java.util.logging.*;

public class Spy implements MailService {
    private static final String AUSTIN_POWERS = "Austin Powers";
    private Logger logger;

    public Spy(Logger logger){
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail){
        if (mail instanceof MailMessage){
            if (mail.getFrom() == AUSTIN_POWERS || mail.getTo() == AUSTIN_POWERS){
                logger.log(Level.WARNING,"Detected target mail correspondence: from {0} to {1} \"{2}\"", new Object[]{mail.getFrom(), mail.getTo(), ((MailMessage) mail).getMessage()});
            }else {
                logger.log(Level.INFO,"Usual correspondence: from {0} to {1}", new Object[]{mail.getFrom(), mail.getTo()});
            }
        }
        return mail;
    }

}
