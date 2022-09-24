package io.github.jwharm.javagi;

/**
 * Represents a {@code typedef} to a primitive type.
 */
public abstract class Alias<T> {
    
    protected T value;
    
    public void setValue(T value) {
        this.value = value;
    }
    
    public T getValue() {
        return this.value;
    }
}
