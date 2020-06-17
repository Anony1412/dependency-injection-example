package com.ptit.dependency_injection_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ptit.dependency_injection_example.myinterface.Shape
import com.ptit.dependency_injection_example.model.Circle
import com.ptit.dependency_injection_example.model.ShapeManager
import com.ptit.dependency_injection_example.model.Square

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initExample()
    }

    private fun initExample() {
        initCircle()
        initSquare()
    }

    private fun initSquare() {
        val circle = Circle(5)
        initShapeManager(circle)
    }

    private fun initCircle() {
        val square = Square(10)
        initShapeManager(square)
    }

    private fun initShapeManager(shape: Shape) {
        ShapeManager().apply {
            setShape(shape)
            showArea()
        }
    }
}
