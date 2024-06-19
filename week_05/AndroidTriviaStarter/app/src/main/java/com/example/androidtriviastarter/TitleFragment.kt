package com.example.androidtriviastarter

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import com.example.androidtriviastarter.databinding.FragmentTitleBinding
import androidx.navigation.findNavController


class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
            R.layout.fragment_title,container,false)


        binding.playButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
        }

        val menuHost: MenuHost = requireActivity()
        menuHost.addMenuProvider(object : MenuProvider{
        override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
            menuInflater.inflate(R.menu.options_menu, menu)
            }
        override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
            when (menuItem.itemId) {
                R.id.aboutFragment ->
                    view?.findNavController()?.navigate(R.id.action_titleFragment_to_aboutFragment)
                else -> return false
                }
                return true
            }
        }, viewLifecycleOwner, Lifecycle.State.RESUMED)

        Log.i("TitleFragment", "onCreateView called")
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("TitleFragment", "onAttach called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("TitleFragment", "onCreate called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("TitleFragment", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("TitleFragment", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("TitleFragment", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("TitleFragment", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("TitleFragment", "onStop called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("TitleFragment", "onDestroyView called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("TitleFragment", "onDetach called")
    }
}
