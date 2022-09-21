package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkProgressBar} is typically used to display the progress of a long
 * running operation.
 * <p>
 * It provides a visual clue that processing is underway. {@code GtkProgressBar}
 * can be used in two different modes: percentage mode and activity mode.
 * <p>
 * <img src="./doc-files/progressbar.png" alt="An example GtkProgressBar">
 * <p>
 * When an application can determine how much work needs to take place
 * (e.g. read a fixed number of bytes from a file) and can monitor its
 * progress, it can use the {@code GtkProgressBar} in percentage mode and the
 * user sees a growing bar indicating the percentage of the work that
 * has been completed. In this mode, the application is required to call
 * {@link ProgressBar#setFraction} periodically to update the progress bar.
 * <p>
 * When an application has no accurate way of knowing the amount of work
 * to do, it can use the {@code GtkProgressBar} in activity mode, which shows
 * activity by a block moving back and forth within the progress area. In
 * this mode, the application is required to call {@link ProgressBar#pulse}
 * periodically to update the progress bar.
 * <p>
 * There is quite a bit of flexibility provided to control the appearance
 * of the {@code GtkProgressBar}. Functions are provided to control the orientation
 * of the bar, optional text can be displayed along with the bar, and the
 * step size used in activity mode can be set.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * progressbar[.osd]
 * ├── [text]
 * ╰── trough[.empty][.full]
 *     ╰── progress[.pulse]
 * }</pre>
 * <p>
 * {@code GtkProgressBar} has a main CSS node with name progressbar and subnodes with
 * names text and trough, of which the latter has a subnode named progress. The
 * text subnode is only present if text is shown. The progress subnode has the
 * style class .pulse when in activity mode. It gets the style classes .left,
 * .right, .top or .bottom added when the progress 'touches' the corresponding
 * end of the GtkProgressBar. The .osd class on the progressbar node is for use
 * in overlays like the one Epiphany has for page loading progress.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkProgressBar} uses the {@link AccessibleRole#PROGRESS_BAR} role.
 */
public class ProgressBar extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public ProgressBar(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ProgressBar */
    public static ProgressBar castFrom(org.gtk.gobject.Object gobject) {
        return new ProgressBar(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_progress_bar_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkProgressBar}.
     */
    public ProgressBar() {
        super(constructNew());
    }
    
    /**
     * Returns the ellipsizing position of the progress bar.
     * <p>
     * See {@link ProgressBar#setEllipsize}.
     */
    public org.pango.EllipsizeMode getEllipsize() {
        var RESULT = gtk_h.gtk_progress_bar_get_ellipsize(handle());
        return org.pango.EllipsizeMode.fromValue(RESULT);
    }
    
    /**
     * Returns the current fraction of the task that’s been completed.
     */
    public double getFraction() {
        var RESULT = gtk_h.gtk_progress_bar_get_fraction(handle());
        return RESULT;
    }
    
    /**
     * Returns whether the progress bar is inverted.
     */
    public boolean getInverted() {
        var RESULT = gtk_h.gtk_progress_bar_get_inverted(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the pulse step.
     * <p>
     * See {@link ProgressBar#setPulseStep}.
     */
    public double getPulseStep() {
        var RESULT = gtk_h.gtk_progress_bar_get_pulse_step(handle());
        return RESULT;
    }
    
    /**
     * Returns whether the {@code GtkProgressBar} shows text.
     * <p>
     * See {@link ProgressBar#setShowText}.
     */
    public boolean getShowText() {
        var RESULT = gtk_h.gtk_progress_bar_get_show_text(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the text that is displayed with the progress bar.
     * <p>
     * The return value is a reference to the text, not a copy of it,
     * so will become invalid if you change the text in the progress bar.
     */
    public java.lang.String getText() {
        var RESULT = gtk_h.gtk_progress_bar_get_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Indicates that some progress has been made, but you don’t know how much.
     * <p>
     * Causes the progress bar to enter “activity mode,” where a block
     * bounces back and forth. Each call to {@link ProgressBar#pulse}
     * causes the block to move by a little bit (the amount of movement
     * per pulse is determined by {@link ProgressBar#setPulseStep}).
     */
    public void pulse() {
        gtk_h.gtk_progress_bar_pulse(handle());
    }
    
    /**
     * Sets the mode used to ellipsize the text.
     * <p>
     * The text is ellipsized if there is not enough space
     * to render the entire string.
     */
    public void setEllipsize(org.pango.EllipsizeMode mode) {
        gtk_h.gtk_progress_bar_set_ellipsize(handle(), mode.getValue());
    }
    
    /**
     * Causes the progress bar to “fill in” the given fraction
     * of the bar.
     * <p>
     * The fraction should be between 0.0 and 1.0, inclusive.
     */
    public void setFraction(double fraction) {
        gtk_h.gtk_progress_bar_set_fraction(handle(), fraction);
    }
    
    /**
     * Sets whether the progress bar is inverted.
     * <p>
     * Progress bars normally grow from top to bottom or left to right.
     * Inverted progress bars grow in the opposite direction.
     */
    public void setInverted(boolean inverted) {
        gtk_h.gtk_progress_bar_set_inverted(handle(), inverted ? 1 : 0);
    }
    
    /**
     * Sets the fraction of total progress bar length to move the
     * bouncing block.
     * <p>
     * The bouncing block is moved when {@link ProgressBar#pulse}
     * is called.
     */
    public void setPulseStep(double fraction) {
        gtk_h.gtk_progress_bar_set_pulse_step(handle(), fraction);
    }
    
    /**
     * Sets whether the progress bar will show text next to the bar.
     * <p>
     * The shown text is either the value of the {@code Gtk.ProgressBar:text}
     * property or, if that is <code>null</code>, the {@code Gtk.ProgressBar:fraction} value,
     * as a percentage.
     * <p>
     * To make a progress bar that is styled and sized suitably for containing
     * text (even if the actual text is blank), set {@code Gtk.ProgressBar:show-text}
     * to <code>true</code> and {@code Gtk.ProgressBar:text} to the empty string (not <code>null</code>).
     */
    public void setShowText(boolean showText) {
        gtk_h.gtk_progress_bar_set_show_text(handle(), showText ? 1 : 0);
    }
    
    /**
     * Causes the given {@code text} to appear next to the progress bar.
     * <p>
     * If {@code text} is <code>null</code> and {@code Gtk.ProgressBar:show-text} is <code>true</code>,
     * the current value of {@code Gtk.ProgressBar:fraction} will be displayed
     * as a percentage.
     * <p>
     * If {@code text} is non-<code>null</code> and {@code Gtk.ProgressBar:show-text} is <code>true</code>,
     * the text will be displayed. In this case, it will not display the progress
     * percentage. If {@code text} is the empty string, the progress bar will still
     * be styled and sized suitably for containing text, as long as
     * {@code Gtk.ProgressBar:show-text} is <code>true</code>.
     */
    public void setText(java.lang.String text) {
        gtk_h.gtk_progress_bar_set_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
}
