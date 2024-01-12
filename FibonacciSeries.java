class FibonacciSeries{
public static void main(String[] args){
//0 1 1 2 3 5 8 13
//f s t
//  f s
int n=10;
int f=0;
int s=1;

System.out.print(f+"  "+s);
for(int i=2;i<=n;i++){
int t=f+s;
System.out.print(" "+t+" ");
f=s;
s=t;
}
}
}




