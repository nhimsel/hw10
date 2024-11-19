public class Player
{
    private String name;
    private int hp; //hit points - a value between 15 and 30
    private int str; //strength - a value between 8 and 12
    private int ac; //armor class - a value between 5 and 17
    
    public Player(String name)
    {
        Dice hp_die = new Dice(16);
        Dice str_die = new Dice(5);
        Dice ac_die = new Dice(13);

        this.name = name;
        this.hp = hp_die.roll()+14;
        this.str = str_die.roll()+7;
        this.ac = ac_die.roll()+4;
    }
    
    public void display()
    {
        System.out.println(this);
    }

    @Override
    public String toString()
    {
        String top = " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _";
        String bottom = " ‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾ ‾";
        if (this.name.length()<=5)
        {
            return top+"\n| "+this.name+"\t\t\t  HP="+this.hp+
                " |\n|\t\t\t\t|\n| STR="+this.str+
                "  \t\t\t|\n| AC="+this.ac+
                "   \t\t\t|\n|\t\t\t\t|\n"+bottom;
        }
        else if (this.name.length()<=13)
        {
            return top+"\n| "+this.name+"\t\t  HP="+this.hp+
                " |\n|\t\t\t\t|\n| STR="+this.str+
                "  \t\t\t|\n| AC="+this.ac+
                "   \t\t\t|\n|\t\t\t\t|\n"+bottom;
        }
        else if (this.name.length()<=21)
        {
            return top+"\n| "+this.name+"\t  HP="+this.hp+
                " |\n|\t\t\t\t|\n| STR="+this.str+
                "  \t\t\t|\n| AC="+this.ac+
                "   \t\t\t|\n|\t\t\t\t|\n"+bottom;
        }
        else
        {
            top = ""; bottom = "";
            for (int i=0; i<this.name.length()/2+2; i++)
            {
                top += " _";
                bottom += " ‾";
            }
            return top+"\n| "+this.name+"\t   \n|\n| HP="+this.hp+
                "\t\t\t\n| STR="+this.str+
                "  \t\t\t\n| AC="+this.ac+
                "   \t\t\t\n|\n"+bottom;
        }
    }    
}