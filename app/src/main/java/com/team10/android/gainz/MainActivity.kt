package com.team10.android.gainz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import com.team10.android.gainz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  private lateinit var navController: NavController
  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
//    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(R.layout.activity_main)

//    val navHostFragment = supportFragmentManager
//      .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//    navController = navHostFragment.navController
//    setupBottomNav(navController)
  }

//  private fun setupBottomNav(navController: NavController) {
//    val bottomNav = binding.bottomNavigation
//    bottomNav.setupWithNavController(navController)
//
//    /*
//    The set of destinations by id considered at the top level of your information hierarchy.
//    The Up button will not be displayed when on these destinations.
//     */
//    val appBarConfig = AppBarConfiguration(
//      setOf(
//        R.id.nav_flow
//      )
//    )
//    /*
//   By calling this method, the title in the action bar will automatically be updated when
//   the destination changes
//    */
//    setupActionBarWithNavController(navController, appBarConfig)
//
//
//  }
}