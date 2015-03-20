public class Room
{
  String name;
  public boolean coin;
  public boolean creature;
  public boolean dragon;
  
  private Room north;
  private Room south;
  private Room east;
  private Room west;
  
  
  public Room(String name, boolean coin, boolean creature, boolean dragon)
  {
    this.name = name;
    this.coin = coin;
    this.creature = creature;
    this.dragon = dragon;
  }
  
  public void setNorth(Room other)
  {
    this.north = other;
    other.south = this;
  }
  
  public void setSouth(Room other)
  {
    this.south = other;
    other.north = this;
  }
  
  public void setEast(Room other)
  {
    this.east = other;
    other.west = this;
  }
  
  public void setWest(Room other)
  {
    this.west = other;
    other.east = this;
  }
  
  public Room getNorth()
  {
    return this.north;
  }
  
  public Room getSouth()
  {
    return this.south;
  }
  
  public Room getEast()
  {
    return this.east;
  }
  
  public Room getWest()
  {
    return this.west;
  }
  
  
}