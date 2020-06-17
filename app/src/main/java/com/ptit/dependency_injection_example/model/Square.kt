package com.ptit.dependency_injection_example.model

import com.ptit.dependency_injection_example.myinterface.Shape

class Square(private val x: Int):
    Shape {

    override fun getArea(): Int = x * 4
}
