package com.example.fragmentapp
/*
*  Mostrando ciclo de vida de um fragment apos a sua criacao,
*  lembrar sempre do ciclo de vida da activity pois o fragment usa o ciclo de vida da activity
*  para utilizar seu ciclo de vida.
*/

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

class Fragment1 : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(
            context,
            "on Attach() is called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(
            context,
            "on Create() is called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Toast.makeText(
            context,
            "on CreateView() is called",
            Toast.LENGTH_SHORT
        ).show()
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(
            context,
            "on Start() is called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(
            context,
            "on Resume() is called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(
            context,
            "on Pause() is called",
            Toast.LENGTH_SHORT
        ).show()
    }
    
    override fun onStop() {
        super.onStop()
        Toast.makeText(
            context,
            "on Stop() is called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(
            context,
            "on DestroyView() is called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(
            context,
            "on Destroy() is called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onDetach() {
        super.onDetach()
        Toast.makeText(
            context,
            "on Detach() is called",
            Toast.LENGTH_SHORT
        ).show()
    }
}