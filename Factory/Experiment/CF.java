public class CF<T>
{
     Class<?> t=null;
    public CF(Class<?> t)
    {
        this.t=t;
    }
    public T getInstance() throws IllegalAccessException,InstantiationException
    {   
        
        return (T) this.t.newInstance();
    }

}
   

   