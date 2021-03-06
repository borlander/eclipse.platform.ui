/*******************************************************************************
 * Copyright (c) 2000, 2015 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jface.viewers;

/**
 * Interface common to all objects that provide a selection.
 *
 * @see ISelection
 * @see ISelectionChangedListener
 * @see SelectionChangedEvent
 */
public interface ISelectionProvider {
	/**
	 * Adds a listener for selection changes in this selection provider.
	 * Has no effect if an identical listener is already registered.
	 *
	 * @param listener a selection changed listener
	 */
	public void addSelectionChangedListener(ISelectionChangedListener listener);

	/**
	 * Returns the current selection for this provider.
	 *
	 * @return the current selection
	 */
	public ISelection getSelection();

	/**
	 * Removes the given selection change listener from this selection provider.
	 * Has no effect if an identical listener is not registered.
	 *
	 * @param listener a selection changed listener
	 */
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener);

	/**
	 * Sets the current selection for this selection provider.
	 *
	 * @param selection the new selection
	 */
	public void setSelection(ISelection selection);
}
