public class Skill{
    // 1. create all private attributes
    // 2. constructors 
    // 3. public getters & setters

    private String skillName;
    private int level;

    public Skill(){}

    public Skill(String skillName){
        this.skillName = skillName;
        this.level=0;
    }

    public Skill(String skillName, int level){
        this.skillName = skillName;
        this.level=level;
    }

    //getter -- no parameters , with return 
    public String getSkillName(){
        return this.skillName;
    }
    //setter -- have parameter, no return
    public void setSkillName(String skillName){
        this.skillName = skillName;
    }

    public int getLevel(){
        return this.level;
    }    
    public void setLevel(int level){
        this.level = level;
    }


}