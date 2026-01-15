package com.arhizmei.daybydayhabittracker.ui.view

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.R
import com.google.android.material.button.MaterialButton

class GoogleSignInButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.materialButtonStyle
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
                    dp(18)
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
        text = "Continue with Google"
        setIconResource(R.drawable.ic_google)

        iconGravity = ICON_GRAVITY_TEXT_START
        iconSize = dp(18)

        setBackgroundColor(Color.WHITE)
        setTextColor(Color.BLACK)

        strokeWidth = dp(1)
        strokeColor = ColorStateList.valueOf(Color.LTGRAY)

        cornerRadius = dp(12)
    }

    private fun dp(i: Int): Int = (value*resources.displayMetrics.density).toInt()
}