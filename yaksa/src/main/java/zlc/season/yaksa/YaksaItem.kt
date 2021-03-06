package zlc.season.yaksa

import android.view.View

/**
 * Item interface
 */
interface YaksaItem {
    /**
     *  Render item
     *
     *  @param position Item position
     *
     *  @param view  Item view
     */
    fun render(position: Int, view: View)

    /**
     * Provide xml layout resource
     */
    fun xml(): Int

    /**
     * Only work for Grid, provide the span size of this item
     */
    fun gridSpanSize(): Int {
        return 1
    }

    /**
     * Only work for Stagger, whether this item needs to occupy the full width
     */
    fun staggerFullSpan(): Boolean {
        return false
    }
}