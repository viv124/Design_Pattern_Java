
public class GenericFactory<T>
{
    Class<?> t=null;
    public GenericFactory(Class<?> t)
    {
        this.t=t;
    }

    public T getInstance() throws IllegalAccessException,InstantiationException
    {   
        
        return (T) this.t.newInstance();
    }
}