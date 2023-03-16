public class Notebook
{
    private int cost;
    private int ram;

    public Notebook(int cost, int ram)
    {
        this.cost = cost;
        this.ram = ram;
    }

    public String toString()
    {
        return "Notebook [cost: " + cost + ", ram: " + ram + "]";
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCost() {
        return cost;
    }

    public int getRam() {
        return ram;
    }
}