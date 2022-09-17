package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A layout manager using constraints to describe relations between widgets.
 * <p><code>GtkConstraintLayout</code> is a layout manager that uses relations between
 * widget attributes, expressed via {@link org.gtk.gtk.Constraint} instances, to
 * measure and allocate widgets.
 * <p>
 * <h3>How do constraints work</h3>
 * <p>
 * Constraints are objects defining the relationship between attributes
 * of a widget; you can read the description of the {@link org.gtk.gtk.Constraint}
 * class to have a more in depth definition.
 * <p>
 * By taking multiple constraints and applying them to the children of
 * a widget using <code>GtkConstraintLayout</code>, it&#39;s possible to describe
 * complex layout policies; each constraint applied to a child or to the parent
 * widgets contributes to the full description of the layout, in terms of
 * parameters for resolving the value of each attribute.
 * <p>
 * It is important to note that a layout is defined by the totality of
 * constraints; removing a child, or a constraint, from an existing layout
 * without changing the remaining constraints may result in an unstable
 * or unsolvable layout.
 * <p>
 * Constraints have an implicit &#34;reading order&#34;; you should start describing
 * each edge of each child, as well as their relationship with the parent
 * container, from the top left (or top right, in RTL languages), horizontally
 * first, and then vertically.
 * <p>
 * A constraint-based layout with too few constraints can become &#34;unstable&#34;,
 * that is: have more than one solution. The behavior of an unstable layout
 * is undefined.
 * <p>
 * A constraint-based layout with conflicting constraints may be unsolvable,
 * and lead to an unstable layout. You can use the {@link [property@Gtk.Constraint:strength] (ref=property)}
 * property of {@link org.gtk.gtk.Constraint} to &#34;nudge&#34; the layout towards a solution.
 * <p>
 * <h3>GtkConstraintLayout as GtkBuildable</h3>
 * <p><code>GtkConstraintLayout</code> implements the {@link [iface@Gtk.Buildable] (ref=iface)} interface and
 * has a custom &#34;constraints&#34; element which allows describing constraints in
 * a {@link org.gtk.gtk.Builder} UI file.
 * <p>
 * An example of a UI definition fragment specifying a constraint:
 * <p><pre>xml
 *   &#60;object class=&#34;GtkConstraintLayout&#34;&#62;
 *     &#60;constraints&#62;
 *       &#60;constraint target=&#34;button&#34; target-attribute=&#34;start&#34;
 *                   relation=&#34;eq&#34;
 *                   source=&#34;super&#34; source-attribute=&#34;start&#34;
 *                   constant=&#34;12&#34;
 *                   strength=&#34;required&#34; /&#62;
 *       &#60;constraint target=&#34;button&#34; target-attribute=&#34;width&#34;
 *                   relation=&#34;ge&#34;
 *                   constant=&#34;250&#34;
 *                   strength=&#34;strong&#34; /&#62;
 *     &#60;/constraints&#62;
 *   &#60;/object&#62;
 * </pre>
 * <p>
 * The definition above will add two constraints to the GtkConstraintLayout:
 * <p>
 *  - a required constraint between the leading edge of &#34;button&#34; and
 *    the leading edge of the widget using the constraint layout, plus
 *    12 pixels
 *  - a strong, constant constraint making the width of &#34;button&#34; greater
 *    than, or equal to 250 pixels
 * <p>
 * The &#34;target&#34; and &#34;target-attribute&#34; attributes are required.
 * <p>
 * The &#34;source&#34; and &#34;source-attribute&#34; attributes of the &#34;constraint&#34;
 * element are optional; if they are not specified, the constraint is
 * assumed to be a constant.
 * <p>
 * The &#34;relation&#34; attribute is optional; if not specified, the constraint
 * is assumed to be an equality.
 * <p>
 * The &#34;strength&#34; attribute is optional; if not specified, the constraint
 * is assumed to be required.
 * <p>
 * The &#34;source&#34; and &#34;target&#34; attributes can be set to &#34;super&#34; to indicate
 * that the constraint target is the widget using the GtkConstraintLayout.
 * <p>
 * There can be &#34;constant&#34; and &#34;multiplier&#34; attributes.
 * <p>
 * Additionally, the &#34;constraints&#34; element can also contain a description
 * of the <code>GtkConstraintGuides</code> used by the layout:
 * <p><pre>xml
 *   &#60;constraints&#62;
 *     &#60;guide min-width=&#34;100&#34; max-width=&#34;500&#34; name=&#34;hspace&#34;/&#62;
 *     &#60;guide min-height=&#34;64&#34; nat-height=&#34;128&#34; name=&#34;vspace&#34; strength=&#34;strong&#34;/&#62;
 *   &#60;/constraints&#62;
 * </pre>
 * <p>
 * The &#34;guide&#34; element has the following optional attributes:
 * <p>
 *   - &#34;min-width&#34;, &#34;nat-width&#34;, and &#34;max-width&#34;, describe the minimum,
 *     natural, and maximum width of the guide, respectively
 *   - &#34;min-height&#34;, &#34;nat-height&#34;, and &#34;max-height&#34;, describe the minimum,
 *     natural, and maximum height of the guide, respectively
 *   - &#34;strength&#34; describes the strength of the constraint on the natural
 *     size of the guide; if not specified, the constraint is assumed to
 *     have a medium strength
 *   - &#34;name&#34; describes a name for the guide, useful when debugging
 * <p>
 * <h3>Using the Visual Format Language</h3>
 * <p>
 * Complex constraints can be described using a compact syntax called VFL,
 * or *Visual Format Language*.
 * <p>
 * The Visual Format Language describes all the constraints on a row or
 * column, typically starting from the leading edge towards the trailing
 * one. Each element of the layout is composed by &#34;views&#34;, which identify
 * a {@link [iface@Gtk.ConstraintTarget] (ref=iface)}.
 * <p>
 * For instance:
 * <p><pre>
 *   {@link [button]}-{@link [textField]}
 * </pre>
 * <p>
 * Describes a constraint that binds the trailing edge of &#34;button&#34; to the
 * leading edge of &#34;textField&#34;, leaving a default space between the two.
 * <p>
 * Using VFL is also possible to specify predicates that describe constraints
 * on attributes like width and height:
 * <p><pre>
 *   // Width must be greater than, or equal to 50
 *   {@link [button(&#62;=50)]}
 * 
 *   // Width of button1 must be equal to width of button2
 *   {@link [button1(==button2)]}
 * </pre>
 * <p>
 * The default orientation for a VFL description is horizontal, unless
 * otherwise specified:
 * <p><pre>
 *   // horizontal orientation, default attribute: width
 *   H:{@link [button(&#62;=150)]}
 * 
 *   // vertical orientation, default attribute: height
 *   V:{@link [button1(==button2)]}
 * </pre>
 * <p>
 * It&#39;s also possible to specify multiple predicates, as well as their
 * strength:
 * <p><pre>
 *   // minimum width of button must be 150
 *   // natural width of button can be 250
 *   {@link [button(&#62;=150@required, ==250@medium)] (ref=button(&#62;=150)}
 * </pre>
 * <p>
 * Finally, it&#39;s also possible to use simple arithmetic operators:
 * <p><pre>
 *   // width of button1 must be equal to width of button2
 *   // divided by 2 plus 12
 *   {@link [button1(button2 / 2 + 12)]}
 * </pre>
 */
public class ConstraintLayout extends LayoutManager implements Buildable {

    public ConstraintLayout(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ConstraintLayout */
    public static ConstraintLayout castFrom(org.gtk.gobject.Object gobject) {
        return new ConstraintLayout(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_constraint_layout_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkConstraintLayout</code> layout manager.
     */
    public ConstraintLayout() {
        super(constructNew());
    }
    
    /**
     * Adds a constraint to the layout manager.
     * <p>
     * The {@link [property@Gtk.Constraint:source] (ref=property)} and {@link [property@Gtk.Constraint:target] (ref=property)}
     * properties of <code>constraint</code> can be:
     * <p>
     *  - set to <code>NULL</code> to indicate that the constraint refers to the
     *    widget using <code>layout</code>
     *  - set to the {@link org.gtk.gtk.Widget} using <code>layout</code>
     *  - set to a child of the {@link org.gtk.gtk.Widget} using <code>layout</code>
     *  - set to a {@link org.gtk.gtk.ConstraintGuide} that is part of <code>layout</code>
     * 
     * The @layout acquires the ownership of @constraint after calling
     * this function.
     */
    public void addConstraint(Constraint constraint) {
        gtk_h.gtk_constraint_layout_add_constraint(handle(), constraint.getReference().unowned().handle());
    }
    
    /**
     * Creates a list of constraints from a VFL description.
     * <p>
     * The Visual Format Language, VFL, is based on Apple&#39;s AutoLayout {@link [VFL]}(https://developer.apple.com/library/content/documentation/UserExperience/Conceptual/AutolayoutPG/VisualFormatLanguage.html).
     * <p>
     * The <code>views</code> dictionary is used to match {@link [iface@Gtk.ConstraintTarget] (ref=iface)}
     * instances to the symbolic view name inside the VFL.
     * <p>
     * The VFL grammar is:
     * <p><pre>
     *        &#60;visualFormatString&#62; = (&#60;orientation&#62;)?
     *                               (&#60;superview&#62;&#60;connection&#62;)?
     *                               &#60;view&#62;(&#60;connection&#62;&#60;view&#62;)*
     *                               (&#60;connection&#62;&#60;superview&#62;)?
     *               &#60;orientation&#62; = &#39;H&#39; | &#39;V&#39;
     *                 &#60;superview&#62; = &#39;|&#39;
     *                &#60;connection&#62; = &#39;&#39; | &#39;-&#39; &#60;predicateList&#62; &#39;-&#39; | &#39;-&#39;
     *             &#60;predicateList&#62; = &#60;simplePredicate&#62; | &#60;predicateListWithParens&#62;
     *           &#60;simplePredicate&#62; = &#60;metricName&#62; | &#60;positiveNumber&#62;
     *   &#60;predicateListWithParens&#62; = &#39;(&#39; &#60;predicate&#62; (&#39;,&#39; &#60;predicate&#62;)* &#39;)&#39;
     *                 &#60;predicate&#62; = (&#60;relation&#62;)? &#60;objectOfPredicate&#62; (&#60;operatorList&#62;)? (&#39;@&#39; &#60;priority&#62;)?
     *                  &#60;relation&#62; = &#39;==&#39; | &#39;&#60;=&#39; | &#39;&#62;=&#39;
     *         &#60;objectOfPredicate&#62; = &#60;constant&#62; | &#60;viewName&#62; | (&#39;.&#39; &#60;attributeName&#62;)?
     *                  &#60;priority&#62; = &#60;positiveNumber&#62; | &#39;required&#39; | &#39;strong&#39; | &#39;medium&#39; | &#39;weak&#39;
     *                  &#60;constant&#62; = &#60;number&#62;
     *              &#60;operatorList&#62; = (&#60;multiplyOperator&#62;)? (&#60;addOperator&#62;)?
     *          &#60;multiplyOperator&#62; = {@link [ &#39;*&#39; | &#39;/&#39; ]} &#60;positiveNumber&#62;
     *               &#60;addOperator&#62; = {@link [ &#39;+&#39; | &#39;-&#39; ]} &#60;positiveNumber&#62;
     *                  &#60;viewName&#62; = {@link [A-Za-z_]}({@link [A-Za-z0-9_]}*) // A C identifier
     *                &#60;metricName&#62; = {@link [A-Za-z_]}({@link [A-Za-z0-9_]}*) // A C identifier
     *             &#60;attributeName&#62; = &#39;top&#39; | &#39;bottom&#39; | &#39;left&#39; | &#39;right&#39; | &#39;width&#39; | &#39;height&#39; |
     *                               &#39;start&#39; | &#39;end&#39; | &#39;centerX&#39; | &#39;centerY&#39; | &#39;baseline&#39;
     *            &#60;positiveNumber&#62; // A positive real number parseable by g_ascii_strtod()
     *                    &#60;number&#62; // A real number parseable by g_ascii_strtod()
     * </pre>
     * <p>
     * **Note**: The VFL grammar used by GTK is slightly different than the one
     * defined by Apple, as it can use symbolic values for the constraint&#39;s
     * strength instead of numeric values; additionally, GTK allows adding
     * simple arithmetic operations inside predicates.
     * <p>
     * Examples of VFL descriptions are:
     * <p><pre>
     *   // Default spacing
     *   {@link [button]}-{@link [textField]}
     * 
     *   // Width constraint
     *   {@link [button(&#62;=50)]}
     * 
     *   // Connection to super view
     *   |-50-{@link [purpleBox]}-50-|
     * 
     *   // Vertical layout
     *   V:{@link [topField]}-10-{@link [bottomField]}
     * 
     *   // Flush views
     *   {@link [maroonView]}{@link [blueView]}
     * 
     *   // Priority
     *   {@link [button(100@strong)] (ref=button(100)}
     * 
     *   // Equal widths
     *   {@link [button1(==button2)]}
     * 
     *   // Multiple predicates
     *   {@link [flexibleButton(&#62;=70,&#60;=100)]}
     * 
     *   // A complete line of layout
     *   |-{@link [find]}-{@link [findNext]}-{@link [findField(&#62;=20)]}-|
     * 
     *   // Operators
     *   {@link [button1(button2 / 3 + 50)]}
     * 
     *   // Named attributes
     *   {@link [button1(==button2.height)]}
     * </pre>
     */
    public org.gtk.glib.List addConstraintsFromDescriptionv(java.lang.String[] lines, long nLines, int hspacing, int vspacing, org.gtk.glib.HashTable views) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_constraint_layout_add_constraints_from_descriptionv(handle(), Interop.allocateNativeArray(lines).handle(), nLines, hspacing, vspacing, views.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Adds a guide to <code>layout</code>.
     * <p>
     * A guide can be used as the source or target of constraints,
     * like a widget, but it is not visible.
     * <p>
     * The <code>layout</code> acquires the ownership of <code>guide</code> after calling
     * this function.
     */
    public void addGuide(ConstraintGuide guide) {
        gtk_h.gtk_constraint_layout_add_guide(handle(), guide.getReference().unowned().handle());
    }
    
    /**
     * Returns a <code>GListModel</code> to track the constraints that are
     * part of the layout.
     * 
     * Calling this function will enable extra internal bookkeeping
     * to track constraints and emit signals on the returned listmodel.
     * It may slow down operations a lot.
     * 
     * Applications should try hard to avoid calling this function
     * because of the slowdowns.
     */
    public org.gtk.gio.ListModel observeConstraints() {
        var RESULT = gtk_h.gtk_constraint_layout_observe_constraints(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, true));
    }
    
    /**
     * Returns a <code>GListModel</code> to track the guides that are
     * part of the layout.
     * 
     * Calling this function will enable extra internal bookkeeping
     * to track guides and emit signals on the returned listmodel.
     * It may slow down operations a lot.
     * 
     * Applications should try hard to avoid calling this function
     * because of the slowdowns.
     */
    public org.gtk.gio.ListModel observeGuides() {
        var RESULT = gtk_h.gtk_constraint_layout_observe_guides(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, true));
    }
    
    /**
     * Removes all constraints from the layout manager.
     */
    public void removeAllConstraints() {
        gtk_h.gtk_constraint_layout_remove_all_constraints(handle());
    }
    
    /**
     * Removes <code>constraint</code> from the layout manager,
     * so that it no longer influences the layout.
     */
    public void removeConstraint(Constraint constraint) {
        gtk_h.gtk_constraint_layout_remove_constraint(handle(), constraint.handle());
    }
    
    /**
     * Removes <code>guide</code> from the layout manager,
     * so that it no longer influences the layout.
     */
    public void removeGuide(ConstraintGuide guide) {
        gtk_h.gtk_constraint_layout_remove_guide(handle(), guide.handle());
    }
    
}
