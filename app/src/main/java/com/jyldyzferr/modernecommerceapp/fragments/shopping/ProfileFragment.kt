package com.jyldyzferr.modernecommerceapp.fragments.shopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jyldyzferr.modernecommerceapp.databinding.FragmentProfileBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
//    val viewModel by viewModels<ProfileViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.constraintProfile.setOnClickListener {
//            findNavController().navigate(R.id.action_profileFragment_to_userAccountFragment)
//        }
//
//        binding.linearAllOrders.setOnClickListener {
//            findNavController().navigate(R.id.action_profileFragment_to_ordersFragment)
//        }
//
//        binding.linearBilling.setOnClickListener {
//            val action = ProfileFragmentDirections.actionProfileFragmentToBillingFragment(
//                0f,
//                emptyArray(),
//                false
//            )
//            findNavController().navigate(action)
//        }
//
//        binding.linearLogOut.setOnClickListener {
//            viewModel.logout()
//            val intent = Intent(requireActivity(), LoginRegisterActivity::class.java)
//            startActivity(intent)
//            requireActivity().finish()
//        }

//        binding.tvVersion.text = "Version ${BuildConfig.VERSION_CODE}"

//        lifecycleScope.launchWhenStarted {
//            viewModel.user.collectLatest {
//                when (it) {
//                    is Resource.Loading -> {
//                        binding.progressbarSettings.visibility = View.VISIBLE
//                    }
//                    is Resource.Success -> {
//                        binding.progressbarSettings.visibility = View.GONE
//                        Glide.with(requireView()).load(it.data!!.imagePath).error(ColorDrawable(
//                            Color.BLACK)).into(binding.imageUser)
//                        binding.tvUserName.text = "${it.data.firstName} ${it.data.lastName}"
//                    }
//                    is Resource.Error -> {
//                        Toast.makeText(requireContext(), it.message, Toast.LENGTH_SHORT).show()
//                        binding.progressbarSettings.visibility = View.GONE
//                    }
//                    else -> Unit
//                }
//            }
//        }
    }

    override fun onResume() {
        super.onResume()

//        showBottomNavigationView()
    }
}











