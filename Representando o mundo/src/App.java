public class App {
    public static void main(String[] args) throws Exception {
        Subject calculusSubject = new Subject();
        calculusSubject.setName("Cálculo");
        calculusSubject.setIntroTopicName("Derivadas");
        calculusSubject.setFinalTopicName("Limites");
        System.out.println("Começando a estudar "+ calculusSubject.getName()+"...");
        System.out.println(calculusSubject.getIntroTopicCompletion());
        System.out.println(calculusSubject.getFinalTopicCompletion());
        calculusSubject.setAproval();
        System.out.println(calculusSubject.getAproval());
        System.out.println("Começando a estudar "+ calculusSubject.getName()+" com responde Aí");
        calculusSubject.completeIntroTopic();
        calculusSubject.completeFinalTopic();
        System.out.println(calculusSubject.getIntroTopicCompletion());
        System.out.println(calculusSubject.getFinalTopicCompletion());
        calculusSubject.setAproval();
        System.out.println(calculusSubject.getAproval());
    }
}
