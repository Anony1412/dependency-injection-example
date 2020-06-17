package com.ptit.dependency_injection_example.model

import com.ptit.dependency_injection_example.myinterface.Shape
import com.ptit.dependency_injection_example.myinterface.ShapeSetter

class ShapeManager:
    ShapeSetter {

    private var shape: Shape? = null

    override fun setShape(shape: Shape) {
        this.shape = shape
    }

    fun showArea() {
        println(shape?.getArea())
    }
}
