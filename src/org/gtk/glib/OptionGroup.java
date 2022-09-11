package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GOptionGroup` struct defines the options in a single
 * group. The struct has only private fields and should not be directly accessed.
 * 
 * All options in a group share the same translation function. Libraries which
 * need to parse commandline options are expected to provide a function for
 * getting a `GOptionGroup` holding their options, which
 * the application can then add to its #GOptionContext.
 */
public class OptionGroup extends io.github.jwharm.javagi.interop.ResourceBase {

    public OptionGroup(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Creates a new #GOptionGroup.
     */
    public OptionGroup(java.lang.String name, java.lang.String description, java.lang.String helpDescription, jdk.incubator.foreign.MemoryAddress userData, DestroyNotify destroy) {
        super(References.get(gtk_h.g_option_group_new(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(description).handle(), Interop.allocateNativeString(helpDescription).handle(), userData, destroy), true));
    }
    
    /**
     * Adds the options specified in @entries to @group.
     */
    public void addEntries(OptionEntry[] entries) {
        gtk_h.g_option_group_add_entries(handle(), Interop.allocateNativeArray(entries).handle());
    }
    
    /**
     * Increments the reference count of @group by one.
     */
    public OptionGroup ref() {
        var RESULT = gtk_h.g_option_group_ref(handle());
        return new OptionGroup(References.get(RESULT, true));
    }
    
    /**
     * Sets the function which is used to translate user-visible strings,
     * for `--help` output. Different groups can use different
     * #GTranslateFuncs. If @func is %NULL, strings are not translated.
     * 
     * If you are using gettext(), you only need to set the translation
     * domain, see g_option_group_set_translation_domain().
     */
    public void setTranslateFunc(OptionGroup group, TranslateFunc func) {
        try {
            int hash = func.hashCode();
            Interop.signalRegistry.put(hash, func);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTranslateFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_option_group_set_translate_func(handle(), nativeSymbol, intSegment, Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * A convenience function to use gettext() for translating
     * user-visible strings.
     */
    public void setTranslationDomain(java.lang.String domain) {
        gtk_h.g_option_group_set_translation_domain(handle(), Interop.allocateNativeString(domain).handle());
    }
    
    /**
     * Decrements the reference count of @group by one.
     * If the reference count drops to 0, the @group will be freed.
     * and all memory allocated by the @group is released.
     */
    public void unref() {
        gtk_h.g_option_group_unref(handle());
    }
    
}
