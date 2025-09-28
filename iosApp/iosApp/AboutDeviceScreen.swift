//
//  AboutDeviceScreen.swift
//  iosApp
//
//  Created by Gautam Helange on 28/09/25.
//

import SwiftUI

struct AboutDeviceScreen: View {
    var body: some View {
        NavigationStack {
            AboutListView()
                .navigationTitle("About Device")
        }
    }
}

#Preview {
    AboutDeviceScreen()
}
