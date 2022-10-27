package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of function that is used for deciding what fonts get
 * shown in a {@code GtkFontChooser}.
 * <p>
 * See {@link FontChooser#setFilterFunc}.
 */
@FunctionalInterface
public interface FontFilterFunc {
        boolean onFontFilterFunc(@NotNull org.pango.FontFamily family, @NotNull org.pango.FontFace face);
}
