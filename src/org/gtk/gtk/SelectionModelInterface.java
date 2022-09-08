package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The list of virtual functions for the `GtkSelectionModel` interface.
 * No function must be implemented, but unless `GtkSelectionModel::is_selected()`
 * is implemented, it will not be possible to select items in the set.
 * 
 * The model does not need to implement any functions to support either
 * selecting or unselecting items. Of course, if the model does not do that,
 * it means that users cannot select or unselect items in a list widget
 * using the model.
 * 
 * All selection functions fall back to `GtkSelectionModel::set_selection()`
 * so it is sufficient to implement just that function for full selection
 * support.
 */
public class SelectionModelInterface extends io.github.jwharm.javagi.interop.ResourceBase {

    public SelectionModelInterface(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
}
