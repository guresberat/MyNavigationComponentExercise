package com.example.mynavigationcomponentexercise.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.mynavigationcomponentexercise.Money
import com.example.mynavigationcomponentexercise.R

class ConfirmationFragment : Fragment() {

    lateinit var recipient: String
    lateinit var money: Money

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_confirmation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val amount = money!!.amount
        val confirmationMessage = "You have sent $$amount to $recipient"
        view.findViewById<TextView>(R.id.confirmation_message).text = confirmationMessage
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recipient = requireArguments().getString("recipient").toString()
        money = requireArguments().getParcelable("amount")!!
    }

}