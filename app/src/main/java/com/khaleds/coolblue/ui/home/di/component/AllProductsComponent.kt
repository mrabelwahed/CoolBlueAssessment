package com.khaleds.coolblue.ui.home.di.component

import com.khaleds.coolblue.presentation.di.component.PresentationComponent
import com.khaleds.coolblue.ui.details.di.scope.ProductDetailsScope
import com.khaleds.coolblue.ui.home.HomeFragment
import com.khaleds.coolblue.ui.home.di.scope.AllProductsScope
import dagger.Component
@ProductDetailsScope
@Component(dependencies = [PresentationComponent::class])
interface AllProductsComponent {
    fun inject(homeFragment: HomeFragment)
}