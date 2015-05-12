package lab2;

import java.util.Iterator;

class IAIterator<T> implements Iterator<T>{
		
		IterableArray<T> marray;
		int it_cur; //index of the next element to return
		int last_ret; //index of the last element returned
		
		IAIterator(IterableArray<T> ma){
			marray=ma;
			it_cur=0;
			last_ret=-1;
		}
		
		@Override
		public boolean hasNext(){
			/* the array cursor is at the index where to add new elements, so if the iterator 
			 * cursor reaches it, it is because it already iterated over all non-null elements */
			if (marray.array_cur == it_cur) return false;
			/* do not let the iterator cursor exceeds the maximum number of elements in the array */
			if (it_cur>=0 && marray.array_cur>0 && it_cur<=marray.array_cur-1) return true;
			else return false;
		}
	
		@Override
		@SuppressWarnings("unchecked")
		public T next(){
			/* do not let the iterator cursor exceeds the maximum number of elements in the array */
			if (it_cur>=0 && marray.array_cur>0 && it_cur<=marray.array_cur-1) {
				last_ret=it_cur;
				return (T)marray.array[it_cur++];
			}
			else return null;
		}

		@Override
		public void remove() throws IllegalStateException {
			if (last_ret<0) throw new IllegalStateException();
			/* in this case we know that it_cur>=1 because last_ret >=0 */
			last_ret=-1;
			it_cur--;
			/* in this case we know that it_cur<marray.array.length */
			for (int i=it_cur;i<marray.array.length-1; i++)
				marray.array[i]=marray.array[i+1];
			marray.array[marray.array.length-1]=null;
			marray.array_cur--;
		}
	}
