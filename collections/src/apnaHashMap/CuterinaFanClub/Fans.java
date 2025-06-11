package apnaHashMap.CuterinaFanClub;
public class Fans 
{
    private String name;
    private int age;
    private String sex;

    public Fans(String name, int age, String sex)
    {
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getSex()
    {
        return sex;
    }

    public String toString()
    {
        return "{Name: "+name+" Age: "+age+" Gender: "+sex+"}";
    }
}
