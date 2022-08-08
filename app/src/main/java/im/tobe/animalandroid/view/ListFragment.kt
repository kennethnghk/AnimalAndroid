package im.tobe.animalandroid.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.floatingactionbutton.FloatingActionButton
import im.tobe.animalandroid.R

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toDetailBtn = view.findViewById<FloatingActionButton>(R.id.toDetailBtn)
        toDetailBtn.setOnClickListener {
            val action = ListFragmentDirections.actionDetail()
            Navigation.findNavController(it).navigate(action)
        }
    }
}