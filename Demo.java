package com.coderw;
import java.util.*;
import java.io.*;
/**
 * 单利模式 工厂模式
 * list ArrayList  Vector
 * map HashMap
 * put Iterator
 * while(it.hasnext)
 * Created by dale on 2016/10/11.
 * 姓名 工号 薪水
 * ArrayList a1=new ArrayList
 * get();返回第几个元素
 * cat a=(cat)a1.get(0);
 * size();集合的大小
 * add();添加对象的引用
 * remove();删除元素
 * contails 判断当前集合是否包含某个元素  返回布尔值
 * for(int i=0;i<a1.size();i++){
 *     Cat a=(Cat)a1.get(i);
 *     System.out.print(a.getName());
 * }
 * indexOf(); 返回对象的位置
 */
//        int a[][] = {{0,0,0,1},{1,0,0,0},{0,1,0,1},{0,0,1,1}} ;
//        System.out.println(a[0].length);
//        System.out.println(a[1].length);
//        for(int i=0 ; i <a.length ; i++) {
//            for(int j=0 ; j<a[i].length ; j++) {
//                System.out.print(a[i][j]+"  ") ;
//            }
//            System.out.println("");
//        }
public class Demo {
    public static void main(String[] args){
        ArrayList a1=new ArrayList();
        Water p1=new Water(1,"小汪",2);
        Water p2=new Water(2,"小李",5);
        Water p3=new Water(3,"小五",4);
        Water p4=new Water(4,"小刘",1);
        Water p5=new Water(5,"小八",3);
        Water p6=new Water();
        a1.add(p1);
        a1.add(p2);
        a1.add(p3);
        a1.add(p4);
        a1.add(p5);
//        System.out.println(a1);
//        Collections.sort(a1);
//        System.out.println(a1);
        for(int i=0;i<a1.size();i++){
              Water a=(Water)a1.get(i);
              System.out.println("工号："+a.getID()+" "+"姓名："+a.getName()+" "+"薪水："+a.getSalary());
         }
         //工资最高
             int max=0;
             Water c=(Water)a1.get(0);
             max=c.getSalary();
             for(int j=1;j<a1.size();j++){
                 Water b=(Water)a1.get(j);
                 if (max<b.getSalary()){
                     max=b.getSalary();
                 }
             }
             System.out.println("工资最多的为 :"+max);
//         工资排序
               //Water xx=null;
               for(int i=0;i<a1.size()-1;i++){
                    for(int j=0;j<a1.size()-1-i;j++) {
                       Water a=(Water)a1.get(j);
                       Water b= (Water)a1.get(j+1);
                       if (a.getSalary() > b.getSalary()){
                            //xx=a;
                            //a=b;
                           // b=xx;
                           a1.set(j,b);
                           a1.set(j+1,a);
                       }
                   }
                 }

                for(int i=0;i<a1.size();i++){
                    Water m=(Water)a1.get(i);
                    System.out.println("工号："+m.getID()+" "+"姓名："+m.getName()+" "+"薪水："+m.getSalary());
                }
//    public static void sortIntMethod(List list){
//    Collections.sort(list, new Comparator() {
//                public int compare(Object o1, Object o2) {
//                    Water stu1 = (Water) o1;
//                    Water stu2 = (Water) o2;
//                    if (stu1.getSalary() > stu2.getSalary()) {
//                        return 1;
//                    } else if (stu1.getSalary() == stu2.getSalary()) {
//                        return 0;
//                    } else {
//                        return -1;
//                    }
//                }
//            });
//                System.out.println("/////////////排序之后///////////////");
//       for(int i=0;i<a1.size();i++){
//                    Water st=(Water)list.get(i);
//                    System.out.println("st.age="+st.getID()+",st.name="+st.getName());
//           }
//        }
        //输入函数
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String aname = null;
        //捕获异常处理
        try{
            aname= br.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        int x=Integer.parseInt(aname);
        for(int j=0;j<a1.size();j++) {
            Water a=(Water)a1.get(j);
            //System.out.println(a.getID());
            if (x==a.getID()) {
                System.out.println("工号 ："+a.getID()+"姓名 ："+a.getName()+"薪水 ："+a.getSalary());
            }else{

            }
        }
        //输入id号修改工资

        //System.out.println(a1.size());

    }
}
class Water{
    private int ID;
    private String name;
    private int salary;
    public Water(int ID,String name,int salary){
        this.ID=ID;
        this.name=name;
        this.salary=salary;
    }
    public Water(){

    }
    public String getName(){
        return this.name;
    }
    public int getID(){
        return this.ID;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public void setName(String name){
        this.name=name;
        }
    public void setSalary(int salary){
        this.salary=salary;
    }
}
/*
*
// 按照List中的某个Int类型的属性进行排序 * @param list *
 //@ SuppressWarnings("unchecked")
//public static void sortIntMethod(List list){
//    Collections.sort(list, new Comparator(){
//        @Override
//        public int compare(Object o1, Object o2) {
//            Student stu1=(Student)o1;
//            Student stu2=(Student)o2;
//            if(stu1.getAge()>stu2.getAge()){
//                return 1;
//            }else if(stu1.getAge()==stu2.getAge()){
//                return 0;
//                else{
//                    return -1; 			} 		}	 	 }); System.out.println("/////////////排序之后///////////////");
//        for(int i=0;i<list.size();i++){ 	Student st=(Student)list.get(i);
//            System.out.println("st.age="+st.getAge()+",st.name="+st.getName()); } }
//
//*
//* */