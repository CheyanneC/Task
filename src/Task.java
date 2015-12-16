public class Task 
{
    private String name, description;
    
    public Task(String n, String d)
    {
        name = n;
        description = d;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setName(String newN)
    {
        name = newN;
    }
    
    public void setDescription(String newD)
    {
        description = newD;
    }
    
    public boolean validate()
    {
        if(name == null || description == null || name.equals("") || description.equals(""))
            return false;
        else
            return true;
    }
    
    public String toString()
    {
        return "Name: " + name + "\nDescription: " + description + "\n===========\n";
    }
}