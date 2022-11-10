package LFP.Day2;

public class SpringSeason {
    private int m;
    private int d;

    public void setM(int m) {
        this.m = m;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getM() {
        return m;
    }

    public int getD() {
        return d;
    }
    public boolean dayOfMonthBetweenMarch20AndJune20(){
        if(m<3||m>6){
            return false;
        }
        if(m==3&&d<20){
            return false;
        }
        if(m==3&&d>31){
         return    false;
        }
        if(m==3&&(d>=20&&d<=31)){
            return true;
        }
        if((m==4||m==5||m==6)&&(d>0&&d<=30))
            return true;
        return false;
    }
}
