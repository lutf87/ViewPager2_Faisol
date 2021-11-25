package com.faisol.viewpager2_faisol

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.ScrollingTabContainerView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.my_friends_item.*

class MyFriendsAdapter(private val context: Context, private  val items:
ArrayList<MyFriendsList>):RecyclerView.Adapter<MyFriendsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.my_friends_item, parent, false)
    )
    override fun getItemCount(): Int {
        return items.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }
    class ViewHolder (override val containerView:View):
    RecyclerView.ViewHolder(containerView), LayoutContainer{
        fun bindItem(item:MyFriendsList){
            txt_friends_name.text=item.name
            txt_friends_gender.text=item.gender
            txt_friends_email.text=item.email
            txt_friends_tlp.text=item.tlp
            txt_friends_address.text=item.address
        }
    }
}