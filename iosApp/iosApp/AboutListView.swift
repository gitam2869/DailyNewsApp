//
//  AboutListView.swift
//  iosApp
//
//  Created by Gautam Helange on 28/09/25.
//

import SwiftUI
import Shared

struct AboutListView: View {

    private struct RowItem: Hashable {
        let title: String
        let subTitle: String
    }
    
    private let items: [RowItem] = {
        let platForm = Platform()
        
        var result: [RowItem] = [
            .init(
                title: "Operating System",
                subTitle: "\(platForm.osName) \(platForm.osVersion)"
            ),
            .init(
                title: "Device",
                subTitle: "\(platForm.deviceModel)"
            ),
            .init(
                title: "Density",
                subTitle: "@\(platForm.density)x"
            )
        ]
        return result
    }()

    var body: some View {
        List {
            ForEach(items, id: \.self) { item in
                VStack(alignment: .leading) {
                    Text(item.title)
                        .font(.footnote)
                        .foregroundStyle(.secondary)
                    Text(item.subTitle)
                        .font(.body)
                        .foregroundStyle(.primary)
                }
                .padding(.vertical, 4)
            }
        }
    }
}

#Preview {
    AboutListView()
}
