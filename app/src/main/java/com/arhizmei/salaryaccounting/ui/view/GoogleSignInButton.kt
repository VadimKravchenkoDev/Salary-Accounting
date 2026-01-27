package com.arhizmei.salaryaccounting.ui.view

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.util.AttributeSet
import androidx.core.content.ContextCompat
import com.arhizmei.salaryaccounting.R
import com.google.android.material.button.MaterialButton

class GoogleSignInButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = com.google.android.material.R.attr.materialButtonStyle
) : MaterialButton(context, attrs, defStyleAttr) {
    init {
        setupDefaults()
        readAttrs(attrs)
    }

    private fun readAttrs(attrs: AttributeSet?) {
        if (attrs == null) return

        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.GoogleSignInButton,
            0,
            0
        ).apply {
            try {
                getString(R.styleable.GoogleSignInButton_googleText)?.let {
                    text = it
                }

                iconSize = getDimensionPixelSize(
                    R.styleable.GoogleSignInButton_googleIconSize,
                    dp(24)
                )

                cornerRadius = getDimensionPixelSize(
                    R.styleable.GoogleSignInButton_googleCornerRadius,
                    dp(12)
                )
            } finally {
                recycle()
            }
        }
    }

    private fun setupDefaults() {
        setBackgroundColor(Color.WHITE)
        setTextColor(Color.BLACK)

        iconTint = null

        ContextCompat.getDrawable(context, R.drawable.ic_google)?.let {
            icon = it
        }

        iconGravity = ICON_GRAVITY_TEXT_START
        iconSize = dp(24)
        iconPadding = dp(12)

        // Остальные настройки
        text = "Continue with Google"
        strokeWidth = dp(1)
        strokeColor = ColorStateList.valueOf(Color.LTGRAY)
        cornerRadius = dp(12)
    }

    private fun dp(i: Int): Int = (i * resources.displayMetrics.density).toInt()
}