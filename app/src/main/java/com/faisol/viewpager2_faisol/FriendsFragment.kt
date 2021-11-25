package com.faisol.viewpager2_faisol

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.friends_fragment.*

class FriendsFragment: Fragment() {
    lateinit var friendsList: ArrayList<MyFriendsList>
    private fun friendDataSimulation(){
        friendsList= ArrayList()
        friendsList.add(
            MyFriendsList("Rama", "Male", "rama@gmail.com",
            "+62 838-3278-2634", "Kwagean")
        )
        friendsList.add(
            MyFriendsList("Fahmi", "Male", "fahmi@gmail.com",
            "+62 838-4808-2593", "Kemiri")
        )
        friendsList.add(
            MyFriendsList("Rohmad", "Male", "rohmadali@gmail.com",
            "+62 857-0654-9415", "Blimbing Rejo")
        )
        friendsList.add(
            MyFriendsList("Awaluddin", "Male", "gendut@gmail.com",
            "+62 857-9221-5676", "Sukoharjo")
        )
        friendsList.add(
            MyFriendsList("Desi", "Female", "desi@gmail.com",
            "+62 858-5658-2495", "Gedangan")
        )
        friendsList.add(
            MyFriendsList("Farila", "Female", "far@gmail.com",
            "+62 858-5281-2745", "Kemiri")
        )
        friendsList.add(
            MyFriendsList("Faaza", "Male", "fahza@gmail.com",
            "+62 888-0940-5114", "Gedangsewu")
        )
        friendsList.add(
            MyFriendsList("Zidan", "Male", "mbon@gmail.com",
            "+62 882-9917-0208", "Nglamong-Pare")
        )
        friendsList.add(
            MyFriendsList("Handi", "Male", "handiilham@gmail.com",
            "+62 858-5863-4584", "Badas")
        )
        friendsList.add(
            MyFriendsList("Bagus", "Male", "bagusrestu@gmail.com",
            "+62 823-3305-6495", "Nglamong-Pare")
        )
    }
    private fun friendsAppear(){
        rv_myfriendslist.layoutManager=LinearLayoutManager(activity)
        rv_myfriendslist.adapter=MyFriendsAdapter(requireActivity(), friendsList)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.friends_fragment, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView(){
        friendDataSimulation()
        friendsAppear()
    }
}