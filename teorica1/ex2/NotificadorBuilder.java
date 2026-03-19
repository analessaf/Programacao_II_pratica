public class NotificadorBuilder implements  {
    public static Notificador build (String tipo){
        if (tipo.equals ("EMAIL")){
            return new NotificadorEmail();
        }
        else if (tipo.equals ("SMS")){
            return new NotificadorSMS();
        }
        return null;
    }
}