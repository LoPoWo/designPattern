package com.wlp.behavioral.Iterator;


/**
 *具体聚合类
 * @param <T>
 */
public class MyAggregate<T> implements IAggregate{
    private Object[] objects ;
    private int size = 0 ;

    public MyAggregate(){
        objects = new Object[10];
    }

    /**
     * 返回迭代器
     * @return
     */
    public IMyIterator<T> createIterator() {
        return new ConcreteIterator(this);
    }
    /**
     * 添加元素
     */
    public void add(T t){
        //检测是否扩容
        checkdilatation(size+1);
        objects[size++] = t;
    }

    /**
     * 删除元素
     * @param index
     * @return
     */
    public T remove(int index){
        if(index >= size || index < 0) throw new IndexOutOfBoundsException("size:"+size+",index:"+index);
        T oldElment = (T) objects[index];
        //删除了数据，我们要把删除下标后面的全部元素向左移动一个位置
        //得到需要移动几个元素（减1是因为下标是从0开始）
        int needMoveElementNum = size - index - 1;
        //移动元素
        System.arraycopy(objects,index+1,objects,index,needMoveElementNum);
        //引用赋值为null
        objects[--size] = null ;
        return oldElment;
    }

    public T get(int index){
        rangeCheck(index);
        T t = (T)objects[index];
        return  t;
    }


    /**
     * 范围检测，是否下标越界
     * @param index
     */
    private void rangeCheck(int index){
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("size:"+size+",index:"+index);
    }

    /**
     * 检测扩容
     */
    private final void checkdilatation(int index){
        if(index < objects.length && index >= 0){
            return ;
        }
        Object[] dilatationArr = new Object[(this.objects.length * 2)];
        System.arraycopy(objects,0,dilatationArr,0,objects.length);
        this.objects = dilatationArr;
    }

    /**
     * 元素数量
     * @return
     */
    public int size(){
        return this.size;
    }

    @Override
    public String toString() {
        if(size == 0){
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for(Object o : objects){
            if(o == null) break;
            stringBuilder.append(o);
            stringBuilder.append(", ");
        }
        stringBuilder.delete(stringBuilder.lastIndexOf(","),stringBuilder.length());
        stringBuilder.append("]");
        return stringBuilder.toString() ;
    }


}
