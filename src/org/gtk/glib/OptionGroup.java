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
