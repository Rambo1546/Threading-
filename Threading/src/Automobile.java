
//Using inheritance.
public class Automobile extends Dice {
    
    private int m_caryear;
    private String m_carmake;
    private String m_carmodel; 
    private String m_carcolor; 
    private String m_carname;
    private int m_numberOfGears;
    private int m_currentGear;
    private int m_operatingCycle;
    private int m_currentSpeed;
    private static int m_distanceTraveled;  
    
    
    public Automobile (int Year, String Make, String Model, String Color, String Name, int Gears, int Cycle) {
        
        m_caryear = Year;
        m_carmake = Make;
        m_carmodel = Model;
        m_carcolor = Color;
        m_carname = Name;
        m_numberOfGears = Gears;
        m_operatingCycle = Cycle;

    }
    
    public void setCurrentGear () {
        
        
        if (m_operatingCycle <= m_numberOfGears) {
            m_currentGear = m_operatingCycle;
        }
    }
    
    public int getCurrentSpeed () {
        return m_currentSpeed;
    }
    
    public int getCurrentGear () {
        return m_currentGear;
    }
    
    public int getDistanceTraveled () {
        return m_distanceTraveled;
    }
    
    
    public void setdistanceTraveled() {
        m_distanceTraveled += m_currentSpeed;
    }
    
    public void setCurrentSpeed () {
        
        
        m_currentSpeed = m_currentGear * 10;
    }
    
    public void setOperatingCycle (int cycle) {

        m_operatingCycle = cycle;
    }
    
    public String toString()

    {

                    return m_carname + ": current gear is " + m_currentGear + " current speed is "+ m_currentSpeed + " distance travelled is " + m_distanceTraveled + " gear is " + m_operatingCycle; 

    }
    public static void Vroom()
    {
    	
    	if(m_distanceTraveled > 100){
    		System.out.println("Your car is going fast. It is making that vroom vroom sound");
    	}
    	
    }
    public static void Prr()
    {    if(m_distanceTraveled > 100)
    {
    	System.out.println("Your car doesn not make a vroom vroom ound it makes a Prr sound.");
    }
    }
    public static void Sput()
    {
    	if(m_distanceTraveled > 100)
    	{
    	
    	System.out.println("You are pushing your car to the limit it is Sputtering.");
    }
    }
    //Tried to add te total.
    public static void Total()
    {
    	System.out.println("This is the total distance traveled " + m_distanceTraveled);
    
    }
    }
