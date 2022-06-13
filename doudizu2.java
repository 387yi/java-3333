package text_6_5;

import java.util.*;

public class doudizu2 {
    public static void main(String[] args) {
        HashMap<Integer,String> hash=new HashMap<Integer, String>();

        ArrayList<Integer> array=new ArrayList<Integer>();
        String [] huase={"!","@","#","$"};
        String [] diansu={"2","3","4","5","6","7","8","10","9","J","Q","K","A"};

        int suoyin=0;
        for (String hua:huase){
            for(String dian: diansu){
                hash.put(suoyin,hua+dian);
                array.add(suoyin);
                suoyin++;
            }
        }
        hash.put(suoyin,"小王");
        array.add(suoyin);
        suoyin++;
        hash.put(suoyin,"大王");
        array.add(suoyin);

        Collections.shuffle(array);

        TreeSet<Integer> wanjia1=new TreeSet<Integer>();
        TreeSet<Integer> wanjia2=new TreeSet<Integer>();
        TreeSet<Integer> wanjia3=new TreeSet<Integer>();
        TreeSet<Integer> dipai=new TreeSet<Integer>();

        for(int i=0;i<array.size();i++){
            Integer x = array.get(i);
            if(i>=array.size()-3){
                dipai.add(x);
            }else if(i%3==0){
                wanjia1.add(x);
            }else if(i%3==1){
                wanjia2.add(x);
            }else if(i%3==2){
                wanjia3.add(x);
            }
        }
        kanpai("难受",wanjia1,hash);
        kanpai("烦啊",wanjia2,hash);
        kanpai("想哭",wanjia3,hash);
        kanpai("后悔",dipai,hash);
    }
    public static void kanpai(String name,TreeSet<Integer> wanjia,HashMap<Integer,String> pai){
        System.out.print(name+"的牌是:");
        for(Integer key:wanjia){
            String s = pai.get(key);
            System.out.print(s+" ");
        }
        System.out.println(" ");
    }
}
