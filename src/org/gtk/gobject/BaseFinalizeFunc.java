package org.gtk.gobject;

@FunctionalInterface
public interface BaseFinalizeFunc {

    /**
     * A callback function used by the type system to finalize those portions
     * of a derived types class structure that were setup from the corresponding
     * GBaseInitFunc() function.
     * 
     * Class finalization basically works the inverse way in which class
     * initialization is performed.
     * 
     * See GClassInitFunc() for a discussion of the class initialization process.
     */
    public void onBaseFinalizeFunc(TypeClass gClass);
}
