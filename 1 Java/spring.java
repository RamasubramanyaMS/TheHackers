public class Company { 
  
    // Primary ID which increments 
    // automatically when new entry 
    // is added into the database 
    @Id
    @GeneratedValue(strategy 
                    = GenerationType.AUTO) 
    int id; 
  
    String name; 
  
    // In months 
    int duration; 
    String profile; 
  
    // Can be 0 
    int stipend; 
    boolean workFromHome; 
  
    public Company() 
    { 
    } 
  
    // Parameterized constructor 
    public Company(String name, int duration, 
                   String profile, 
                   int stipend, 
                   boolean workFromHome) 
    { 
        this.name = name; 
        this.duration = duration; 
        this.profile = profile; 
        this.stipend = stipend; 
        this.workFromHome = workFromHome; 
    } 
  
    // Getters and setters of 
    // the variables 
    public int getId() 
    { 
        return id; 
    } 
  
    public String getName() 
    { 
        return name; 
    } 
  
    public int getDuration() 
    { 
        return duration; 
    } 
  
    public String getProfile() 
    { 
        return profile; 
    } 
  
    public int getStipend() 
    { 
        return stipend; 
    } 
  
    public void setId(int id) 
    { 
        this.id = id; 
    } 
  
    public boolean isWorkFromHome() 
    { 
        return workFromHome; 
    } 