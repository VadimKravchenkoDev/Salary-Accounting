package ui
import android.content.Context
import android.util.AttributeSet
import com.google.android.material.button.MaterialButton
import com.arhizmei.daybydayhabittracker.R


class GoogleSignInButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = com.google.android.material.R.attr.materialButtonStyle
) : MaterialButton(context, attrs, defStyleAttr) {
    init {
        setupDefaults()
        readAttrs(attrs)
    }

    private fun readAttrs(attrs: AttributeSet?) {}

    private fun setupDefaults() {
        TODO("Not yet implemented")
    }
}