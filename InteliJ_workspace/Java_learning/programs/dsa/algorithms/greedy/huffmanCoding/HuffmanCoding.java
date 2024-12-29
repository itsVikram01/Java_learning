package dsa.algorithms.greedy.huffmanCoding;

import java.util.*;

class HuffmanCoding {
    static class Node {
        int frequency;
        char character;
        Node left, right;

        Node(char character, int frequency) {
            this.character = character;
            this.frequency = frequency;
        }
    }

    static class HuffmanComparator implements Comparator<Node> {
        public int compare(Node o1, Node o2) {
            return o1.frequency - o2.frequency;
        }
    }

    public static void buildHuffmanTree(char[] chars, int[] frequencies) {
        PriorityQueue<Node> pq = new PriorityQueue<>(new HuffmanComparator());

        for (int i = 0; i < chars.length; i++) {
            pq.add(new Node(chars[i], frequencies[i]));
        }

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();

            Node newNode = new Node('-', left.frequency + right.frequency);
            newNode.left = left;
            newNode.right = right;
            pq.add(newNode);
        }

        Node root = pq.poll();
        printHuffmanCodes(root, "");
    }

    public static void printHuffmanCodes(Node root, String code) {
        if (root == null) return;

        if (root.character != '-') {
            System.out.println(root.character + ": " + code);
        }

        printHuffmanCodes(root.left, code + "0");
        printHuffmanCodes(root.right, code + "1");
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] frequencies = {5, 9, 12, 13, 16, 45};

        buildHuffmanTree(chars, frequencies);
    }
}

