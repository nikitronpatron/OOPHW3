public class Notebook //implements Comparable<Notebook> 
{
    private int cost;
    private int ram;
    private int ssd;

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

    // @Override
    // public int compareTo(Notebook o) {
    //     if (this.cost > o.cost) return 1;
    //     else if (cost == o.cost) return 0;
    //     else return -1;
    // }

}