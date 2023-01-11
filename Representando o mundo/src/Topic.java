public class Topic {
    private String name;
    private boolean isCompleted;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public boolean getCompletion(){
        return this.isCompleted;
    }
    public void setCompletion(){
        this.isCompleted=true;
    }
}