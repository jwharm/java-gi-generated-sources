package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkRevealer</code> animates the transition of its child from invisible to visible.
 * <p>
 * The style of transition can be controlled with
 * {@link org.gtk.gtk.Revealer<code>#setTransitionType</code> .
 * <p>
 * These animations respect the {@link [property@Gtk.Settings:gtk-enable-animations] (ref=property)}
 * setting.
 * <p>
 * <h1>CSS nodes</h1>
 * <p><code>GtkRevealer</code> has a single CSS node with name revealer.
 * When styling <code>GtkRevealer</code> using CSS, remember that it only hides its contents,
 * not itself. That means applied margin, padding and borders will be visible even
 * when the {@link [property@Gtk.Revealer:reveal-child] (ref=property)} property is set to <code>false</code> 
 * <p>
 * <h1>Accessibility</h1>
 * <p><code>GtkRevealer</code> uses the {@link org.gtk.gtk.AccessibleRole<code>#GROUP</code>  role.
 * <p>
 * The child of <code>GtkRevealer</code>, if set, is always available in the accessibility
 * tree, regardless of the state of the revealer widget.
 */
public class Revealer extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Revealer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Revealer */
    public static Revealer castFrom(org.gtk.gobject.Object gobject) {
        return new Revealer(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_revealer_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkRevealer</code>.
     */
    public Revealer() {
        super(constructNew());
    }
    
    /**
     * Gets the child widget of @revealer.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_revealer_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the child is fully revealed.
     * 
     * In other words, this returns whether the transition
     * to the revealed state is completed.
     */
    public boolean getChildRevealed() {
        var RESULT = gtk_h.gtk_revealer_get_child_revealed(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the child is currently revealed.
     * 
     * This function returns <code>true</code> as soon as the transition
     * is to the revealed state is started. To learn whether
     * the child is fully revealed (ie the transition is completed),
     * use {@link org.gtk.gtk.Revealer<code>#getChildRevealed</code> .
     */
    public boolean getRevealChild() {
        var RESULT = gtk_h.gtk_revealer_get_reveal_child(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the amount of time (in milliseconds) that
     * transitions will take.
     */
    public int getTransitionDuration() {
        var RESULT = gtk_h.gtk_revealer_get_transition_duration(handle());
        return RESULT;
    }
    
    /**
     * Gets the type of animation that will be used
     * for transitions in @revealer.
     */
    public RevealerTransitionType getTransitionType() {
        var RESULT = gtk_h.gtk_revealer_get_transition_type(handle());
        return RevealerTransitionType.fromValue(RESULT);
    }
    
    /**
     * Sets the child widget of @revealer.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_revealer_set_child(handle(), child.handle());
    }
    
    /**
     * Tells the <code>GtkRevealer</code> to reveal or conceal its child.
     * 
     * The transition will be animated with the current
     * transition type of @revealer.
     */
    public void setRevealChild(boolean revealChild) {
        gtk_h.gtk_revealer_set_reveal_child(handle(), revealChild ? 1 : 0);
    }
    
    /**
     * Sets the duration that transitions will take.
     */
    public void setTransitionDuration(int duration) {
        gtk_h.gtk_revealer_set_transition_duration(handle(), duration);
    }
    
    /**
     * Sets the type of animation that will be used for
     * transitions in @revealer.
     * 
     * Available types include various kinds of fades and slides.
     */
    public void setTransitionType(RevealerTransitionType transition) {
        gtk_h.gtk_revealer_set_transition_type(handle(), transition.getValue());
    }
    
}
