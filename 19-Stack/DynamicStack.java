
// public class DynamicStack extends CustomStack{
//     public DynamicStack(){
//         super(); //this will call customStack
//     }
//     public DynamicStack(int size){
//         super(size);
//     }

//     @Override
//     public boolean push(int item){
//         if(this.isFull()){
//             //Double the size.
//             int []temp=new int[data.length*2];
//             for(int i=0;i<data.length;i++){
//                 temp[i]=data[i];
//             }
//             data=temp;
//         }
//         //This execute when stack is not full.
//         return super.push(item);
//     }
// }
