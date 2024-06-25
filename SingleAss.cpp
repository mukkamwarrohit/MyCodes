#include <iostream>
using namespace std;
struct Node {
  int data;
  Node* next;

  Node(int data) {
    this->data = data;
    this->next = nullptr;
  }
};

class LinkedList {
 private:
  Node* head;

 public:
  LinkedList() {
    head = nullptr;
  }

  void insertSorted(int data) {
    Node* newNode = new Node(data);
    if (head == nullptr || head->data >= data) {
      newNode->next = head;
      head = newNode;
      return;
    }

    Node* prev = head;
    Node* current = head->next;

    while (current && current->data < data) {
      prev = current;
      current = current->next;
    }

    prev->next = newNode;
    newNode->next = current;
  }

  void printList() {
    Node* temp = head;
    while (temp != nullptr) {
      cout << temp->data << " ";
      temp = temp->next;
    }
    cout << std::endl;
  }
};

int main() {
  LinkedList list;
  list.insertSorted(5);
  list.insertSorted(3);
  list.insertSorted(7);
  list.insertSorted(1);

  
  list.printList();

  return 0;
}
