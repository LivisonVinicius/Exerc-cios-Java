public class Subject {
    private String name;
    private Topic introTopic= new Topic();
    private Topic finalTopic= new Topic();
    private boolean isAproved;
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getIntroTopicName(){
        return this.introTopic.getName();
    }
    public void setIntroTopicName(String name){
        this.introTopic.setName(name);
    }
    public String getFinalTopicName(){
        return this.finalTopic.getName();
    }
    public void setFinalTopicName(String name){
        this.finalTopic.setName(name);
    }
    public String getIntroTopicCompletion(){
        String introTopicName= this.getIntroTopicName();
        if(this.introTopic.getCompletion()){
            return "Você está aprovado em "+ introTopicName;
        }else{
            return "Você não está aprovado em " + introTopicName;
        }
    }
    public String getFinalTopicCompletion(){
        String finalTopicName= this.getFinalTopicName();
        if(this.finalTopic.getCompletion()){
            return "Você está aprovado em "+ finalTopicName;
        }else{
            return "Você não está aprovado em " + finalTopicName;
        }
    }
    public void completeIntroTopic(){
        this.introTopic.setCompletion();
    }
    public void completeFinalTopic(){
        this.finalTopic.setCompletion();
    }
    public String getAproval(){
        String subjectName = this.name;
        if(this.isAproved){
            return "Parabéns você foi aprovado em "+subjectName;
        }else{
            return "Não foi dessa vez, tente novamente.";
        }
    }
    public void setAproval(){
        if(introTopic.getCompletion() && finalTopic.getCompletion()){
            this.isAproved=true;
        }
    }
}
